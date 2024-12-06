// Lambda expresion


interface Book{
  String apply(String val);
}

class LambdaDemo{
   
   
   public static void main(String[] args){
     String str="Anshul";
     Book book=v -> v.concat(" Gupta");
	 System.out.println(book.apply(str));
   
   }

}