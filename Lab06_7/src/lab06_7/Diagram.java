/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_7;
import lab06_7.Layer;
import java.util.ArrayList;
/**
 *
 * @author Linhht-uet
 */
public class Diagram {
    private ArrayList<Layer> diagram;
    
    //Constructor
    public Diagram(int n) {
        this.diagram = new ArrayList<>(n);
    }
    public Diagram() {
        this.diagram = new ArrayList<>();
    }

    //Setter and Getter
    public ArrayList<Layer> getDiagram() {
        return diagram;
    }

    public void setDiagram(ArrayList<Layer> diagram) {
        this.diagram = diagram;
    }
    
    public void removeAllCircles() {
        for (Layer layer : diagram) layer.removeCircle();
    }

    public void removeSameShape(){
        for (Layer layer : diagram){
            layer.eraseSameShape();
        }
    }

    public void drawLayervisiable(){
        for (Layer layer : diagram) if (layer.isVisiable()) layer.drawallshape();
    }

    public Diagram phanloaihinh() {
        Diagram diagram1 = new Diagram(5);
        Layer layerCircle = new Layer();
        Layer layerHexagon = new Layer();
        Layer layerREC = new Layer();
        Layer layerSquare = new Layer();
        Layer layerTri = new Layer();
        for (Layer layer : diagram) {
            layerCircle.addlayer(layer.layercircle());
            layerHexagon.addlayer(layer.layerHexagon());
            layerREC.addlayer(layer.layerREC());
            layerSquare.addlayer(layer.layerSquare());
            layerTri.addlayer(layer.layerTri());
        }
        diagram1.diagram.add(layerCircle);
        diagram1.diagram.add(layerHexagon);
        diagram1.diagram.add(layerREC);
        diagram1.diagram.add(layerSquare);
        diagram1.diagram.add(layerTri);
        return diagram1;
    }
}
