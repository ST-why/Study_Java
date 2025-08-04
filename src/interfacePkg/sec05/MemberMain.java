package interfacePkg.sec05;

public class MemberMain {

    public static void main(String[] args) {
        // DTO DAO 활용 예제
        // 회원가입을 위한 정보가 전달되었다고 가정
        MemberDTO dto = new MemberDTO("abdID", "qwe12", "박순자", "01025931245", "서울");

        // DAO에게 전달해서 회원가입 메서드가 실행되어야 함
        IMemberDAO idao = new MemberDAO();
        MemberDAO dao = new MemberDAO();

        idao.insertMember(dto);
        dao.insertMember(dto);

        //회원검색 - 검색별과 반환 타입 DTO
        dto = idao.selectMember(dto.getMemId());
        // 검색된 결과인 dto를 view로 넘겨서 프론트로 전달
    }

}
