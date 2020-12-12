package com.xuyue.replay;

/**
 * hashCode()与equals()
 * @author Tony Xu
 *
 */
public class _5_HashCode_Equals {

	public static void main(String[] args) {
		System.out.println("hashCode()作用是获取哈希码，也称为散列码，实际上返回的是一个整数，通过哈希码确定对象在哈希表中的索引位置；\n"
				+ "没有hashcode，集合中元素重复判定可能要调用好多次equals方法，执行效率太低，有hashcode之后先判断hashcode是不是一样，不一样的话equals就不用执行了\n "
				+ "hashCode相同，两个对象也不一定相等；\n 两个对象相等hashcode肯定是一样的；\n equals不重写的话，和==一样比较的是对象地址,肯定是不相等的；\n");
		Student s1= new Student();
		s1.setAddr("s1地址");
		s1.setAge("s1年龄");
		s1.setName("s1姓名");
		s1.setSex("s1性别");
		s1.setWeight(100);
		
		Student s2= new Student();
		s2.setAddr("s2地址");
		s2.setAge("s2年龄");
		s2.setName("s2姓名");
		s2.setSex("s2性别");
		s2.setWeight(200);
		
		Student s3= new Student();
		s3.setAddr("s1地址");
		s3.setAge("s1年龄");
		s3.setName("s1姓名");
		s3.setSex("s1性别");
		s3.setWeight(100);
		System.out.println("s1:"+s1+"["+s1.getAddr()+","+s1.getAge()+","+s1.getName()+","+s1.getSex()+","+s1.getWeight()+"]");
		System.out.println("s1.hashCode()："+s1.hashCode());
		System.out.println("s2.hashCode()："+s2.hashCode());
		System.out.println("s3.hashCode()："+s3.hashCode());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
	
	static class Student {
		private String name;// 姓名
		private String sex;// 性别
		private String age;// 年龄
		private float weight;// 体重
		private String addr;// 地址
		
		// 重写hashcode方法
		@Override
		public int hashCode() {
			int result = name.hashCode();
			result = 17 * result + sex.hashCode();
			result = 17 * result + age.hashCode();
			return result;
		}
	 
		// 重写equals方法
		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof Student)) {
	       // instanceof 已经处理了obj = null的情况
				return false;
			}
			Student stuObj = (Student) obj;
			// 地址相等
			if (this == stuObj) {
				return true;
			}
			// 如果两个对象姓名、年龄、性别相等，我们认为两个对象相等
			if (stuObj.name.equals(this.name) && stuObj.sex.equals(this.sex) && stuObj.age.equals(this.age)) {
				return true;
			} else {
				return false;
			}
		}
	 
		public String getName() {
			return name;
		}
	 
		public void setName(String name) {
			this.name = name;
		}
	 
		public String getSex() {
			return sex;
		}
	 
		public void setSex(String sex) {
			this.sex = sex;
		}
	 
		public String getAge() {
			return age;
		}
	 
		public void setAge(String age) {
			this.age = age;
		}
	 
		public float getWeight() {
			return weight;
		}
	 
		public void setWeight(float weight) {
			this.weight = weight;
		}
	 
		public String getAddr() {
			return addr;
		}
	 
		public void setAddr(String addr) {
			this.addr = addr;
		}
	 
	}
}
