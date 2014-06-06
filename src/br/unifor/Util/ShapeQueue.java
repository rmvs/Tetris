package br.unifor.Util;

import java.util.Deque;
import java.util.LinkedList;

import br.unifor.Shape.Shape;

public class ShapeQueue {
         
	     // substituir
	     public Deque<Shape> shapes;
	     private Shape thisShape = null;
	     private ShapeQueue(){
        	 shapes  = new LinkedList<Shape>();
         }
         
         
         private static ShapeQueue instance;
         public static ShapeQueue getInstance(){
        	 return instance == null ? instance = new ShapeQueue() : instance;
         }
         
         public void Enqueue(Shape shape){
        	  shapes.add(shape);
         }
         
         public Shape Dequeue(){
        	 return thisShape = shapes.poll();
         }
         
         public Shape Peek(){
        	 return shapes.peek();
         }
         
         public Shape getCurrent(){
        	 return thisShape;
         }
         
         public int size(){
        	 return shapes.size();
         }
         
         private LinkedList<Shape> disc = null;
         public LinkedList<Shape> discarded(){
        	 init_discarded();
        	 return disc;
         }
         
         private void init_discarded(){
        	 if(disc == null){
        		 disc = new LinkedList<Shape>();
        	 }
         }
         
         public void AddDiscarded(Shape e){
        	 init_discarded();
        	 disc.add(e);
         }
}
