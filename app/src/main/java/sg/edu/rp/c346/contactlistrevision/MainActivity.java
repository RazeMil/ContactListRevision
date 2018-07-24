package sg.edu.rp.c346.contactlistrevision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<ContactItem> alContactList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContact);

        alContactList = new ArrayList<>();

        ContactItem contact1 = new ContactItem("Mary",+65,65442334);
        ContactItem contact2 = new ContactItem("Ken",+65,97442437);

        alContactList.add(contact1);
        alContactList.add(contact2);

        caContact = new CustomAdapter(this,R.layout.contact_item,alContactList);

        lvContact.setAdapter(caContact);
    }
}
