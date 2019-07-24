class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
		this.next=next;
	}
	public String toString(){
		return String.format(val+" ");
	}
}
public class LinkList{
	//头插
	private static Node PushFront(Node head,int val){
		Node node=new Node(val);
		
		node.next=head;
		return node;
	}
	//尾插
	private static Node PushBack(Node head,int val){
		Node node=new Node(val);
		if(head==null){
			return node;
		}
		Node cur=head;
		while(cur.next!=null){
			cur=cur.next;
		}
		cur.next=node;
		return head;
	}
	//头删
	private static Node popFront(Node head){
		if(head==null){
			return null;
		}
		head=head.next;
		return head;
	}
	//尾删
	private static Node popBack(Node head){
		if(head==null){
			return null;
		}
		Node cur=head;
		while(cur.next.next!=null){
			cur=cur.next;
		}
		cur.next=null;
		return head;
	}
	//打印
	private static void print(Node head){
		for(Node cur=head;cur!=null;cur=cur.next){
			System.out.print(cur+"-->");
		}
		System.out.println("null");
	}
	public static void main(String[] args){
		Node head=null;
		head=PushFront(head,1);
		head=PushFront(head,2);
		head=PushFront(head,3);
		head=PushBack(head,10);
		head=PushBack(head,20);
		head=PushBack(head,30);
		print(head);
		head=popFront(head);
		print(head);
		head=popBack(head);
		print(head);
	}
}