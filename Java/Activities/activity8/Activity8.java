package activities.activity8;

public class Activity8 {
    public static void main(String[] args){
        Activity8 activity8 = new Activity8();

        try {
            activity8.exceptionTest("Will print to console");
            activity8.exceptionTest(null);
        } catch(CustomException ce) {
            System.out.println("In Catch block as string is null");
            ce.printStackTrace();
        }
    }

    public void  exceptionTest(String text)throws CustomException{
        if(text==null){
            throw new CustomException("The text value is null");
        } else {
            System.out.println(text);
        }

    }
}
