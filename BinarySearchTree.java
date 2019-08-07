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
public class BinarySearchTree {
    private TreeNode root;
    
    public TreeNode find(Integer data){
        if(root !=null)
            return root.find(data);
        return null;
    }
    
    public void insert(Integer data){
        if(root== null){
            System.out.println(data +" was inserted at root");
            this.root = new TreeNode(data);
        }
        else root.insert(data);
    }
    
    public void delete(Integer data ){
        TreeNode toDel= find(data);
        toDel.delete();
    }
    public Integer smallest (){
        if( this.root != null){
            return root.smallest();
        }
        return null;
    }
    public Integer largest (){
        if( this.root != null){
            return root.largest();
        }
        return null;
    }
    public void inOrder(){
        if (this.root != null){
           this.root.inOrder();
        }
        System.out.println();
    }
     public void preOrder(){
        if (this.root != null){
           this.root.preOrder();
        }
        System.out.println();
    }
    public void postOrder(){
        if (this.root != null){
           this.root.preOrder();
        }
        System.out.println();
    }
    public void height(){
        
    }
    
//        TreeNode current= this.root;
//        TreeNode parent= this.root;
//        boolean isLeftChild = false;
//        // empty tree
//        if (current == null ) return;
//        // find node
//        while(current != null && current.getData() != data){
//            parent = current;
//            if(data<current.getData()){
//                current=current.getLeftChild();
//                isLeftChild=true;
//            } else {
//                current= current.getRightChild();
//                isLeftChild= false;
//            }
//        }
//        
//        if(current==null) return;
//       // Leaf
//        if(current.getLeftChild() == null && current.getRightChild() == null){
//            if(current == root){
//                root = null;
//            } else {
//                if(isLeftChild){
//                    parent.setLeftChild(null);
//                } else{
//                    parent.setRightChild(null);
//                }
//            }
//        } 
//        // has one child to the left
//        else if(current.getRightChild()==null){
//            if(current==root){
//                root = current.getLeftChild();
//            } else if(isLeftChild){
//                parent.setLeftChild(current.getLeftChild());
//            } else {
//                parent.setRightChild(current.getLeftChild());
//            }
//        }
//        // has one child to the right
//        else if(current.getLeftChild()==null){
//            if(current==root){
//                root = current.getRightChild();
//            } else if(isLeftChild){
//                parent.setLeftChild(current.getRightChild());
//            } else {
//                parent.setRightChild(current.getRightChild());
//            }
//        }
//        
//    }
}