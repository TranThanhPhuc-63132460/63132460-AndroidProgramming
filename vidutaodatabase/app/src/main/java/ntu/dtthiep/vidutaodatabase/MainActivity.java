package ntu.dtthiep.vidutaodatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*SQLiteDatabase db = openOrCreateDatabase(
                "QuanLySach.db"//ten
                ,MODE_PRIVATE//gioi han
                ,null
                );
        // B1. Tạo bảng
        // câu lênh tạo bảng
        String sqlXoaBangNeuDaCo="DROP TABLE IF EXISTS Books;";

        String sqlTaoBang = "CREATE TABLE Books( BookID integer PRIMARY KEY, " +
                "BookName text, " +
                "Page integer, " +
                "Price Float, " +
                "Description text);";
        // thực hiện lệnh sql
        db.execSQL(sqlXoaBangNeuDaCo);
        db.execSQL(sqlTaoBang);
        // Ta đóng lại để check
        // Thêm một số dòng dữ liệu vào bảng
        String sqlThem1 = "INSERT INTO BOOKS VALUES(1, 'Không diệt không sinh đừng sợ hãi', 100, 9.99, 'Nỗi khổ lớn nhất của chúng ta là ý niệm đến-đi, lui-tới\n" +
                "java');";
        String sqlThem2 = "INSERT INTO BOOKS VALUES(2, 'Dạy con làm giàu', 320, 19.00, 'Hướng dẫn về tư duy tài chính và đầu tư thông qua câu chuyện về cuộc sống của tác giả với hai người cha, một giàu và một nghèo.\n" +
                "bản');";
        String sqlThem3 = "INSERT INTO BOOKS VALUES(3, 'Sapiens', 120, 0.99, 'Tóm tắt lịch sử phát triển của loài người từ thời tiền sử đến thời hiện đại, với những nhận định sâu sắc về văn hóa, xã hội và khoa học.\n" +
                "cho vui');";
        String sqlThem4 = "INSERT INTO BOOKS VALUES(4, '1984', 1000, 29.50, ' Một tác phẩm về xã hội tương lai tối tăm, nơi chính phủ theo dõi mọi hành vi của công dân và kiểm soát thông tin thông qua chính quyền tuyệt đối.\n" +
                "điển 100.000 từ');";
        String sqlThem5 = "INSERT INTO BOOKS VALUES(5, 'The Great Gatsby', 1, 1, 'Một câu chuyện về tình yêu, lòng tham và sự khao khát của con người trong cuộc sống xa hoa và sôi động của thập niên 1920.');";
        db.execSQL(sqlThem1);
        db.execSQL(sqlThem2);
        db.execSQL(sqlThem3);
        db.execSQL(sqlThem4);
        db.execSQL(sqlThem5);
        db.close();*/

        //Truy vấn select
        //B1: Mở csld
        SQLiteDatabase db = openOrCreateDatabase("QuanLySach.db", MODE_PRIVATE, null
        );
        //B2: Thực thi câu lệnh select
        String sqlSelect ="Select * from Books;";
        Cursor cs = db.rawQuery(sqlSelect,null);
        cs.moveToFirst(); // đưa con trỏ bản ghi về hàng đầu tiên
        // B3: Đổ vào biến nào đó để xử lý
        // Xây dựng model/class cho bảng Books
        // Tạo biến ArrayList<Book> dsSach;
        ArrayList<Book> dsSach = new ArrayList<Book>();
        // Duyệt qua lần lượt từng bản ghi và thêm vào danhSach
        while (cs.moveToNext())
        {
            int idSach = cs.getInt(0);
            String tenSach = cs.getString(1);
            int soTrang = cs.getInt(2);
            float gia = cs.getFloat(3);
            String mota = cs.getString(4);
            Book b = new Book(idSach,tenSach,soTrang,gia,mota);
            dsSach.add(b);
        }

        ArrayList<Book> books = new ArrayList<>();

        if (cs.moveToFirst()) {
            do {
                int id = cs.getInt(0);
                String name = cs.getString(1);
                int pages = cs.getInt(2);
                float price = cs.getFloat(3);
                String description = cs.getString(4);
                books.add(new Book(id, name, pages, price, description));
            } while (cs.moveToNext());
        }
        BookAdapter adapter = new BookAdapter(this, books);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}