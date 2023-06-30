// 1) Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: 
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class hw_2_1 {
    public static void main(String[] args) {
        String s = "select * from students where";
        StringBuilder sb = new StringBuilder();
        String[] myArray = new String[4];
        myArray[0] = "name=Ivanov";
        myArray[1] = "country=Russia";
        myArray[2] = "city=Moscow";
        myArray[3] = "age=Null";
        sb.append(s+" ");
        for (int i = 0; i < myArray.length; i++) {
            // System.out.println(myArray[i]);
            if (myArray[i].equals("age=Null")){
                myArray[i] = "0";
            }else{
                sb.append(myArray[i]+", ");
                
            }
        }
        StringBuilder newsb = new StringBuilder();
        newsb.append(sb.substring(0, sb.length()-2));

        // String where = "'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'";
        // sb.append(s+" "+where);
        System.out.println(newsb);
    }
}