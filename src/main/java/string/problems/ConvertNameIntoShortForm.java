package string.problems;

public class ConvertNameIntoShortForm {

    public static void main(String[] args) {

        String s = "Rahul Kanhaiyalal Varma";

        String [] strArr= s.split(" ");

        StringBuilder output = new StringBuilder();

        for(int i=0;i<strArr.length;i++) {
            if(i==2){
                output.append(strArr[i]);
            }else {
                output.append(strArr[i].charAt(0)).append(". ");
            }
        }

        System.out.println(output);
    }
}
