import java.util.Scanner;

public class EssProduct{
    private String NameItem;
    private int Qty;
    private double Price;

    public EssProduct(String NameItem,int Qty, double Price){
        this.NameItem = NameItem;
        this.Price = Price;
        this.Qty = Qty; 
    }

    public void setNameItem(String NameItem){
        this.NameItem = NameItem;
    } 

    public void setPrice(double Price){
        this.Price = Price;
    }

    public void setQty(int Qty){
        this.Qty= Qty;
    }

    public String getNameItem(){
        return NameItem;
    }
    public int getQty(){
        return Qty;
    }

    public double getPrice(){
        return Price;
    }
}
    