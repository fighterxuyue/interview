package com.xuyue.replay;

/**
 * 乐观锁与悲观锁，JAVA和MySQL里是如何实现的
 * @author Tony Xu
 *
 */
public class _2_Optimistic_pessimistic_Lock {
	
    public static void main(String[] args) {
		String desc="悲观锁假定会发生冲突，访问前就得先获得锁，其他线程访问数据会被阻塞挂起;\n乐观锁假定一般情况下不会发生冲突，只有在提交的时候才去检查是否有冲突；\n"
		           +"JAVA中乐观锁通过CAS实现，悲观锁通过synchronize实现；\nMySQL乐观锁通过MVCC（多版本并发控制）实现，悲观锁通过Select ... for update加上排它锁";
		System.out.println(desc);
	}
}
