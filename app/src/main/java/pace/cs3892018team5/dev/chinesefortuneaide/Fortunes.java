package pace.cs3892018team5.dev.chinesefortuneaide;
import java.util.Random;

    public class Fortunes {
        String[] arr;
        Random ranNum;

        public Fortunes(){

            arr = new String[3];
            ranNum = new Random();

        }

        public void setArray()
        {
            arr[0] = "Fortune 1";
            arr[1] = "Fortune 2";
            arr[2] = "Fortune 3";
            arr[3] = "Fortune 4";
        }

        public String getRandom()
        {
            setArray();
            int index = ranNum.nextInt(arr.length);
            return arr[index];
        }

    }


