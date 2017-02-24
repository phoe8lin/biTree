package com.seassoon.practice;


//二叉排序树
public class biSortTree {
	
	private int value;
	private biSortTree lChild;
	private biSortTree rChild;
	
	public biSortTree(int value, biSortTree l, biSortTree r){
		this.value = value;
		this.lChild = l;
		this.rChild = r;	
	}
	
	public biSortTree getlChild(){
		return lChild;
	}
	
	public biSortTree getrChild(){
		return rChild;
	}
	
	public void setrChild(biSortTree child){
		rChild = child;
	}
	
	public void setlChild(biSortTree child){
		lChild = child;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public static void iterate(biSortTree root){
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
				lChild = new biSortTree(n, null, null);
				}
		}
		else{
			if(rChild != null){
				rChild.addChild(n);
			}
			else{
				rChild = new biSortTree(n, null, null);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		biSortTree root = new biSortTree(array[0], null, null);
		for(int i = 0; i < array.length; i++){
			root.addChild(array[i]);
		}
		biSortTree.iterate(root);

	}

}
