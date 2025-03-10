package ntu.dtthiep.vidutaodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<Book> mBooks;

    public BookAdapter(Context context, ArrayList<Book> books) {
        mContext = context;
        mBooks = books;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.book, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Book book = mBooks.get(position);
        holder.textViewTitle.setText(book.getBookName());
        holder.textViewPage.setText(String.valueOf(book.getPage()));
        holder.textViewPrice.setText(String.valueOf(book.getPrice()));
        holder.textViewDescription.setText(book.getDescription());
    }

    @Override
    public int getItemCount() {
        return mBooks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle, textViewPage, textViewPrice, textViewDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewPage = itemView.findViewById(R.id.textViewPage);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            textViewDescription = itemView.findViewById(R.id.textViewDescription);
        }
    }
}

