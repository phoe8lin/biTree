 package sortTree;

import java.util.Scanner;

//二叉排序树
public class biTree {
	
	private int value;
	private biTree lChild;
	private biTree rChild;
	
	public biTree(int value, biTree l, biTree r){
		this.value = value;
		this.lChild = l;
		this.rChild = r;	
	}
	
	public biTree getlChild(){
		return lChild;
	}
	
	public biTree getrChild(){
		return rChild;
	}
	
	public void setrChild(biTree child){
		rChild = child;
	}
	
	public void setlChild(biTree child){
		lChild = child;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public static void iterate(biTree root){
		if(root.lChild!=null){
			iterate(root.getlChild());
		}
		System.out.println(root.getValue() + " ");
		if(root.rChild!= null){
			iterate(root.getrChild());
		}
	}
	
	public void addChild(int n){
		if(n < value){
			if(lChild != null){
				lChild.addChild(n);
			}
			else{
				lChild = new biTree(n, null, null);
				}
		}
		else{
			if(rChild != null){
				rChild.addChild(n);
			}
			else{
				rChild = new biTree(n, null, null);
			}
		}
	}
	
	public static void midDisplay(biTree value){
		if(value != null){
			System.out.println("中序遍历\n");
			midDisplay(value.lChild);
			System.out.println(value + ",");
			midDisplay(value.rChild);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一组数字，用,隔开\n");
//		Scanner scanner = new Scanner(System.in);
//		String line = scanner.nextLine();
//		String str[] = line.split(",");
//		int[] array = new int[line.length()];
//
//		for(int j = 0;j<str.length ;j++){
//			array[j] = Integer.parseInt(str[j]); 
//		}
		int[] array = new int[]{16, 32, 33, 74, 25, 26, 73, 88, 29, 10};
//		scanner.close();
		biTree root = new biTree(array[0], null, null);
		for(int i = 0; i < array.length; i++){
			root.addChild(array[i]);
		}
		biTree.iterate(root);
		midDisplay(root);

	}

}
