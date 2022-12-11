


public class Where {
    /**
     * Дана строка sql-запроса "select * from students where ". 
     * Сформируйте часть WHERE этого запроса, используя StringBuilder. 
     * Данные для фильтрации приведены ниже в виде json строки. 
     * Если значение null, то параметр не должен попадать в запрос.
     * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
*/
    public static void main(String[] args) {
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder question = new StringBuilder("SELECT * FROM students WHERE");

        str = str.substring(1, str.length() - 1);
        String[] filter = str.split(", ");

        for (int i = 0; i < filter.length; i++) {
            String[] twins = filter[i].split(":");
            String data = twins[1];
            if (!data.equals("\"null\"")) {
                String check = twins[0].substring(1, twins[0].length() - 1);
                data = twins[1].substring(1, twins[1].length() - 1);
                question.append("\n").append(check).append(" = ").append(data);
            }
        }
        System.out.println("\n" + question);
    }
}


