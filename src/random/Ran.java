package random;

class Ran {
    public static void main(String []args ){
        double f = Math.random()/Math.nextDown(1.0);
//        int s = 1;
//        while( f < 11 && s < 11){
//            System.out.println(f);
//            s ++;

            for(int i=1; i<11; i++){
                System.out.println("random getal " +  i);
                System.out.println( f);
            }

    }
        }


