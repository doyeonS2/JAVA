package 직렬화;
import java.io.Serializable;
import java.util.Date;

// 접근제한자에 상관없이 모든 필드가 바이트로 변환됨
// transient 키워드를 사용하면 직렬화 제외됨
// private static final long serialVersionUID (넣지않으면 자동 생성됨)
// 넣어주는 게 권장 사항임
public class Board implements Serializable {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date date;

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Board(int bno, String title, String content, String writer, Date date) {
        this.bno = bno;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;


    }
}
