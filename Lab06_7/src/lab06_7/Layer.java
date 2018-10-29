/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_7;

import java.util.ArrayList;

/**
 *
 * @author Linhht-uet
 */
public class Layer {
    private ArrayList<Shape> layer;
    private boolean visiable;
    
    //COnstructor

    public Layer() {
        layer = new ArrayList<Shape>();
    }

    public Layer(ArrayList<Shape> layer, boolean visiable) {
        this.layer= layer;
        this.visiable = visiable;
    }

    Layer(int n) {
        layer = new ArrayList<>(n);
    }
    
    //Setter and Getter

    public boolean isVisiable() {
        return visiable;
    }

    public void setVisiable(boolean visiable) {
        this.visiable = visiable;
    }

    public ArrayList<Shape> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Shape> layer) {
        this.layer = layer;
    }
    
    public void addlayer(Layer layerr){
        for (Shape shape : layerr.layer){
            layer.add(shape);
        }
    }
    
    public void removeTriangle(){
        for (Shape shape : layer){
            if (shape instanceof Triangle){
                shape.erase();
            }
        }
    }
    public void removeCircle(){
        for (Shape shape : layer){
            if (shape instanceof Circle){
                shape.erase();
            }
        }
    }
    public void eraseSameShape(){
        for (int i = 0; i < layer.size()-1; i++){
            for (int j = i+1; j < layer.size(); j++){
                if(layer.get(i).equals(layer.get(j))){
                    layer.get(j).erase();
                }
            }
        }
    }
    
     public void drawallshape(){
        for (Shape shape : layer){
            shape.draw();
        }
    }
     public Layer layercircle(){
        Layer layer1 = new Layer();
        for (Shape shape : layer){
            if (shape instanceof Circle) layer1.layer.add(shape);
        }
        return layer1;
    }
     public Layer layerHexagon(){
        Layer layer1 = new Layer();
        for (Shape shape : layer){
            if (shape instanceof Hexagon) layer1.layer.add(shape);
        }
        return layer1;
    }

    public Layer layerREC(){
        Layer layer1 = new Layer();
        for (Shape shape : layer){
            if (shape instanceof Rectangle) layer1.layer.add(shape);
        }
        return layer1;
    }

    public Layer layerSquare(){
        Layer layer1 = new Layer();
        for (Shape shape : layer){
            if (shape instanceof Square) layer1.layer.add(shape);
        }
        return layer1;
    }

    public Layer layerTri(){
        Layer layer1 = new Layer();
        for (Shape shape : layer){
            if (shape instanceof Triangle) layer1.layer.add(shape);
        }
        return layer1;
    }
     
    
}
