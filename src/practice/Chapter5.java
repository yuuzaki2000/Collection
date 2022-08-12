package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Task t1 = new Task("2021-10-21","牛乳を買う");
		Task t2 = new Task("2021-09-15","〇〇社面談");
		Task t3 = new Task("2021-12-04","手帳を買う");
		Task t4 = new Task("2021-08-10","散髪に行く");
		Task t5 = new Task("2021-11-09","スクールの課題を解く");
		
		List<Task> lists = new ArrayList<Task>();
		
		lists.add(t1);
		lists.add(t2);
		lists.add(t3);
		lists.add(t4);
		lists.add(t5);
		
		Comparator<Task> comparator = new Comparator<Task>() {

			@Override
			public int compare(Task o1, Task o2) {
				// TODO 自動生成されたメソッド・スタブ
				return o1.getDateString().compareTo(o2.getDateString());
			}
			
		};
		
		Collections.sort(lists,comparator);
		
		for(Task list:lists) {
			System.out.println(list.getDateString() + ":" +list.thing);
		}

	}

}
