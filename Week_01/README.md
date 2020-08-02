#学习笔记

##PriorityQueue
###基于优先堆实现。可传入实现了Compareble接口的元素或者在构造时传入外部的Comparator。不能插入null及不可毕竟的对象，
会抛出ClassCastException。
###优先队列是非线程安全的，在多线程环境下，使用PriorityBlockingQueue。

| 返回值  | 方法    | 描述    |
| :-----:| :----: | :----: |
| boolean | add​(E e) | 插入元素，调用了offer方法（插入不能比较的元素抛出，ClassCastException，插入null抛出NPE ）。|
| void | clear()	 | 清除优先队列所有元素，遍历队列，设置所有元素为null，size为0|
| Comparator<? super E> | comparator()	 | 返回 comparator |
| boolean | contains​(Object o)		 | 判断是否存在某个元素 |
| Iterator<E> | iterator()	 | 返回iterator |
| boolean | offer​(E e)	 | 根据comparebale或compare进行比较后插入|
| boolean | remove(Object o)	 | 删除一个元素，用equals判断|
| boolean | removeEq(Object o)	 | 删除一个元素，用==判断|
| Spliterator<E> | spliterator()	 |生成Spliterator |
| Object[] | toArray()	 | 转换数组成 |
| <T> T[] | toArray​(T[] a)		 | 返回指定运行时类型的数组|

	
总结：
###1.第一周遇到不少困难，首先时间安排不当，导致作业累积到周末，时间紧张。
###2.没有太多的时间思考，无法将老师课中讲的内容与题目有效的结合起来。


	

		



