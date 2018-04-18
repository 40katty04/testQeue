import qpack.*;

public class IQDemo {
    public  static void main (String args[]){
        FixQueue q1= new FixQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircQueue q3 = new CircQueue(10);

        ICharQ iQ;

        char ch;

        iQ=q1;

        for (int i=0;i<10;i++){
            iQ.put((char)('A'+i));

        }

        System.out.println("Cодержимое фиксированной очереди:");
        for (int i=0; i<10;i++){
            ch=iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ=q2;

        for (int i=0;i<10;i++){
            iQ.put((char)('Z'-i));

        }

        System.out.println("Cодержимое динамической очереди:");
        for (int i=0; i<10;i++){
            ch=iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ=q3;

        for (int i=0;i<10;i++){
            iQ.put((char)('A'+i));

        }

        System.out.println("Cодержимое циклической очереди:");
        for (int i=0; i<10;i++){
            ch=iQ.get();
            System.out.print(ch);
        }

        System.out.println();
    }
}
