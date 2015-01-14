package eu.epitech.boulan_d.epiandroid.json;

/**
 * Created by boulan_d on 12/01/2015.
 */
public class Login {
    private static String id;
    private static String login = null;
    private static String title = null;
    private static String internal_email = null;
    private static String firstname = null;
    private static String lastname = null;
    private static String picture = null;
    private static int promo;
    private static int semester;
    private static int uid;
    private static int gid;
    private static String location = null;
    private static String id_promo;
    private static String id_history;
    private static String course_code = null;
    private static String school_code = null;
    private static String school_title = null;
    private static int[] old_id_promo = null;
    private static int[] old_id_location = null;
    private static int studentyear;
    private static boolean admin = false;
    private static boolean close = false;
    private static String close_reason = null;

    public Login() {
    }

    public Login(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Login.id = id;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        Login.login = login;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Login.title = title;
    }

    public static String getInternal_email() {
        return internal_email;
    }

    public static void setInternal_email(String internal_email) {
        Login.internal_email = internal_email;
    }

    public static String getFirstname() {
        return firstname;
    }

    public static void setFirstname(String firstname) {
        Login.firstname = firstname;
    }

    public static String getLastname() {
        return lastname;
    }

    public static void setLastname(String lastname) {
        Login.lastname = lastname;
    }

    public static String getPicture() {
        return picture;
    }

    public static void setPicture(String picture) {
        Login.picture = picture;
    }

    public static int getPromo() {
        return promo;
    }

    public static void setPromo(int promo) {
        Login.promo = promo;
    }

    public static int getSemester() {
        return semester;
    }

    public static void setSemester(int semester) {
        Login.semester = semester;
    }

    public static int getUid() {
        return uid;
    }

    public static void setUid(int uid) {
        Login.uid = uid;
    }

    public static int getGid() {
        return gid;
    }

    public static void setGid(int gid) {
        Login.gid = gid;
    }

    public static String getLocation() {
        return location;
    }

    public static void setLocation(String location) {
        Login.location = location;
    }

    public static String getId_promo() {
        return id_promo;
    }

    public static void setId_promo(String id_promo) {
        Login.id_promo = id_promo;
    }

    public static String getId_history() {
        return id_history;
    }

    public static void setId_history(String id_history) {
        Login.id_history = id_history;
    }

    public static String getCourse_code() {
        return course_code;
    }

    public static void setCourse_code(String course_code) {
        Login.course_code = course_code;
    }

    public static String getSchool_code() {
        return school_code;
    }

    public static void setSchool_code(String school_code) {
        Login.school_code = school_code;
    }

    public static String getSchool_title() {
        return school_title;
    }

    public static void setSchool_title(String school_title) {
        Login.school_title = school_title;
    }

    public static int[] getOld_id_promo() {
        return old_id_promo;
    }

    public static void setOld_id_promo(int[] old_id_promo) {
        Login.old_id_promo = old_id_promo;
    }

    public static int[] getOld_id_location() {
        return old_id_location;
    }

    public static void setOld_id_location(int[] old_id_location) {
        Login.old_id_location = old_id_location;
    }

    public static int getStudentyear() {
        return studentyear;
    }

    public static void setStudentyear(int studentyear) {
        Login.studentyear = studentyear;
    }

    public static boolean isAdmin() {
        return admin;
    }

    public static void setAdmin(boolean admin) {
        Login.admin = admin;
    }

    public static boolean isClose() {
        return close;
    }

    public static void setClose(boolean close) {
        Login.close = close;
    }

    public static String getClose_reason() {
        return close_reason;
    }

    public static void setClose_reason(String close_reason) {
        Login.close_reason = close_reason;
    }

    @Override
    public String toString() {
        return "Login [id=" + id + ", first name=" + firstname + ", " +
                "last name=" + lastname + "]";
    }
}