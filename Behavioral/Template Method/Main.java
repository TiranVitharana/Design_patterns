public class Main {
    public static void main(String args[]) {
        ShippingContainer[] manifest = new ShippingContainer[6];

        manifest[0] = new ShippingContainer("APM-01",12500,"P2Singapore",20);
        manifest[1] = new ShippingContainer("MSC-01",17500,"P3Colombo",25);
        manifest[2] = new ShippingContainer("CMA-01",15250,"P4Dubai",30);
        manifest[3] = new ShippingContainer("PIL-01",11500,"P2Singapore",15);
        manifest[4] = new ShippingContainer("MSC-02",10750,"P3Colombo",20);
        manifest[5] = new ShippingContainer("CMA-02",16750,"P4Dubai",25);


        for(int i=0; i<6;i++) {
            manifest[i].show();
        }
        System.out.println();

        DeadlineSorter ds = new DeadlineSorter(manifest, 6);
        ds.sort();

        for(int i=0; i<6;i++) {
            manifest[i].show();
        }
        System.out.println();

        WeightSorter ws = new WeightSorter(manifest, 6);
        ws.sort();

        for(int i=0; i<6;i++) {
            manifest[i].show();
        }
        System.out.println();

    }
}
