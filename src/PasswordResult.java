import java.util.Objects;

public class PasswordResult {
    boolean res;
    String msg;

    public PasswordResult(boolean res, String msg) {
        this.res = res;
        this.msg = msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordResult that = (PasswordResult) o;
        return res == that.res && msg.equals(that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(res, msg);
    }

    @Override
    public String toString() {
        return "PasswordResult{" +
                "res=" + res +
                ", msg='" + msg + '\'' +
                '}';
    }
}
