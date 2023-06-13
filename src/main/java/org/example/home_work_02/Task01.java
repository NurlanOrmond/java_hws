package org.example.home_work_02;
// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// В итоге должно получится select * from students where name=Ivanov, country=Russia, city=Moscow, age=null

public class Task01 {
    public static void main(String[] args) {
        StringBuilder src = new StringBuilder("select * from students where " +
                "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");

        System.out.println(src);
        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) == '"') {
                src.deleteCharAt(i);
            }
        }
        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) == '{') {
                src.deleteCharAt(i);
            }
        }
        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) == '}') {
                src.deleteCharAt(i);
            }
        }
        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) == ':') {
                src.setCharAt(i, '=');
            }
        }

        System.out.println(src);
    }
}



