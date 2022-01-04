public class Main extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Port in1 = new Port();
        Port out1 = new Port();

        Port in2 = new Port();
        Port out2 = new Port();

        Port in3 = new Port();
        Port out3 = new Port();

        Capsule c1 = new Capsule();
        Capsule c2 = new Capsule();
        Capsule c3 = new Capsule();


        c1.setName("Capsule 1");
        c1.setPortIn(in1);
        c1.setPortOut(out1);

        c2.setName("Capsule 2");
        c2.setPortIn(in2);
        c2.setPortOut(out2);

        c3.setName("Capsule 3");
        c3.setPortIn(in3);
        c3.setPortOut(out3);

        in1.name = "in1";
        in2.name = "in2";
        in3.name = "in3";

        out1.name = "out1";
        out2.name = "out2";
        out3.name = "out3";


        while(true){
            out1.setObjectValue(c1);
            c1.setPortOut(out1);

            in2.setObjectValue(c1);
            c2.setPortIn(in2);
            System.out.println("Out from port: " + c1.getPortOut().name + "object value" + out1.getObjectValue().toString() + "to port: " + c2.getPortIn() );
            Thread.sleep(2000);

            out2.setObjectValue(c2);
            c2.setPortOut(out2);

            in3.setObjectValue(c2);
            c3.setPortIn(in3);

            System.out.println("Out from port: " + c2.getPortOut().name + "object value" + out2.getObjectValue().toString() + "to port: " + c3.getPortIn() );


            out3.setObjectValue(c3);
            c3.setPortOut(out3);

            in1.setObjectValue(c3);
            c1.setPortIn(in1);

            System.out.println("Out from port: " + c3.getPortOut().name + "object value" + out3.getObjectValue().toString() + "to port: " + c1.getPortIn() );

        }
    }
}
