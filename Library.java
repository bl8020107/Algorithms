/** Endpoints
ספרים (Books)
/books  GET מחזיר רשימה של כל הספרים הקיימים במערכת
/books/{id} GET  מחזיר פרטי ספר לפי המזהה שלו
/books  POST    הוספת ספר-יוצר ספר חדש במערכת
/books/{id} PUT עדכון ספר-מעדכן פרטי ספר קיים
/books/{id} DELETE  מחיקת ספר-מוחק ספר לפי המזהה שלו
משתמשים (Users)
/users  GET מחזיר רשימה של כל המשתמשים שבמערכת
/users/{id} GET מחזיר פרטי משתמש לפי המזהה שלו
/users  POST    יצירת משתמש חדש יוצר משתמש חדש
/users/{id} PUT עדכון משתמש-מעדכן פרטי משתמש קיים
/users/{id} DELETE  מחיקת משתמש-מוחק משתמש לפי המזהה שלו
 */




/**Operations
  CRUD לספרים ולקוחות
  השאלה והחזרת ספר
  זיהוי ספר
 
 */





/**DTO

 public class BookDTO {
    private int id;
    private String title;
    private String author;
    private int code;
    private boolean available; // זמין להשאלה או לא

    // Constructors, Getters & Setters
}
UserDTO

public class UserDTO {
    private int id;
    private String name;
    private String phoneNumber;
    private String membershipNumber;
    private boolean active;// האם המשתמש פעיל 
    private List<BookDTO> borrowedBooks; // רשימת ספרים שהמשתמש השאיל

    // Constructors, Getters & Setters
}

 */




/** must
 * Book--------- 
 * title שידעו באיזה ספר מדובר 
 * available שלא יהיה השאלה כפולה
 *  code הקוד של הסםר בספריה 
 *  author מזהה נוסף על הספר למען הסדר הטוב
   User- -----
   name מי מבצע את ההשאלה
   phoneNumber לזהות משתמש יחודי בשונה משם שיכול לחזור על עצמו
   membershipNumber הקוד של הלקוח בספריה
  
 */
