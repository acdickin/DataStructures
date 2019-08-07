/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acosmic.datastructuresandalgorithm;

/**
 *
 * @author v-andick
 */
public class TreeNode {
    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private boolean isDeleted= false;
    
    public TreeNode(Integer data){
        this.data = data;
    }
    public Integer smallest(){
        if (leftChild == null){
            return this.data;
        }
        return this.leftChild.smallest();
    }
    
   public Integer largest(){
        if (rightChild == null){    
            return this.data;
        }
        return this.rightChild.largest();
    }
    public TreeNode find(Integer data){
        if(data == this.data && !isDeleted){
            return this;
        } else if(data<this.data && leftChild !=null){
            return leftChild.find(data);
        } else if( rightChild !=null){
            return rightChild.find(data);
        }
        return null;
    }
    public void insert(Integer data){
        if(data>= this.data){
            if(this.rightChild==null){
                this.rightChild = new TreeNode(data);
            } else{
                this.rightChild.insert(data);
            }
        } else{
            
            if(this.leftChild==null){
                this.leftChild = new TreeNode(data);
            } else{
                this.leftChild.insert(data);
            }
        }
    }
    public void inOrder(){
        if(this.leftChild !=null) this.leftChild.inOrder();
        System.out.print(this.data +",");
        if(this.rightChild != null)  this.rightChild.inOrder();   
    }
    public void preOrder(){
        System.out.print(this.data +",");
        if(this.leftChild !=null) this.leftChild.inOrder();
        if(this.rightChild != null)  this.rightChild.inOrder();   
    }
    public void postOrder(){
        if(this.leftChild !=null) this.leftChild.inOrder();
        if(this.rightChild != null)  this.rightChild.inOrder(); 
        System.out.print(this.data +",");
    }
    
    
    
    public int getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }   

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
    public void delete(){
        this.isDeleted= true;
    }
    public boolean isDeleted(){
        return isDeleted;
    }
}
