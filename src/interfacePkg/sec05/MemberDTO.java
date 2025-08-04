package interfacePkg.sec05;

// 데이터 교환에 사용될 클래스
// 회원관리에 사용할 예정 - 회원 한명을 표현하는 클래스
// 필요 필드: 회원가입시 받아야할 정보 결정해서 생성
// DTO는 데이터 상자, 데이터를 넣고 뺴는 용도로 사용

public class MemberDTO {

    //DTO의 멤버 필드명은 DB 테이블의 컬럼명과  일치시키는게 좋다 (member tavble을 구성했다고 가정)
    private String memId;
    private String memPwd;
    private String memName;
    private String memPhone;
    private String memAddress;

    // DTO는 생서자를 대부분 명시함
    public MemberDTO(String memId, String memPwd, String memName, String memPhone, String memAddress) {
        this.memId = memId;
        this.memPwd = memPwd;
        this.memName = memName;
        this.memPhone = memPhone;
        this.memAddress = memAddress;
    }

    // DTO는 Getter/Setter 구성함


    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public String getMemPwd() {
        return memPwd;
    }

    public void setMemPwd(String memPwd) {
        this.memPwd = memPwd;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getMemPhone() {
        return memPhone;
    }

    public void setMemPhone(String memPhone) {
        this.memPhone = memPhone;
    }

    public String getMemAddress() {
        return memAddress;
    }

    public void setMemAddress(String memAddress) {
        this.memAddress = memAddress;
    }
}
