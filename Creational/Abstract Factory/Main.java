public class Main {
    public static void main(String args[]) {
        FurnitureFacory victorianFurnitureFacory = new VictorianFurnitureFactory();
        Chair victoChair = victorianFurnitureFacory.createChair();
        Sofa victoSofa = victorianFurnitureFacory.createSofa();
        CoffeeTable victoCoffeeTable = victorianFurnitureFacory.createCoffeeTable();

        victoChair.sitOn();
        victoCoffeeTable.placeOn();
        victoSofa.lieOn();
        
    }
}
