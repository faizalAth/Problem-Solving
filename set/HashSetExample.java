package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        
    Set<Books> b= new HashSet<>();
    Books b1=new Books(1,"Maths");
    Books b2=new Books(1,"Maths");
    System.out.println(b1.hashCode() + " --- " + b2.hashCode());
    b.add(b1);
    b.add(b2);
    Iterator<Books> itr=b.iterator();
    while(itr.hasNext())
    {
        Books books=itr.next();
        System.out.println(books.getBook_id()+" , "+books.getBook_name());
    }

    }
}

class Books
 {
  private int book_id;
  private String book_name;
  public int getBook_id() {
  return book_id;
  }
  public void setBook_id(int book_id) {
  this.book_id = book_id;
  }
  public String getBook_name() {
  return book_name;
  }
  public void setBook_name(String book_name) {
  this.book_name = book_name;
  }
  public Books(int book_id, String book_name) {
  super();
  this.book_id = book_id;
  this.book_name = book_name;
  }

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + book_id;
    result = prime * result + ((book_name == null) ? 0 : book_name.hashCode());
    return result;
}


@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Books other = (Books) obj;
    if (book_id != other.book_id)
        return false;
    if (book_name == null) {
        if (other.book_name != null)
            return false;
    } else if (!book_name.equals(other.book_name))
        return false;
    return true;
}
  
}
