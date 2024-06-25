import java.util.List;

class ReverseString
{
    public static void main(String[] args) {
        
        String s ="sky is blue today";
        
       String[] split = s.split(" ");
List<String> list = new ArrayList();
       for(int i=split.length-1;i>=0;i--)
       {
            list.add(split[i]);
       }
       System.out.println(String.join(" ", list));
   
    }

    

}