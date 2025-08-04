package interfacePkg.sec05;

// 쇼핑몰에서 회원관리를 위한 DAO 인터페이스
// 회원관리 기능
// 1. 회원가입: 1명의 회원 정보를 받아서 DB에 저장하고 종료. 반환값 없음
// 2. 회원탈퇴: 1명 회원의 memId를 전달 받아서 DB에서 해당 회원을 찾아 삭제하고 종료. 반환값 없음
// 3. 회원정보 검색: 1명 회원의 id를 전달받아서 DB에서 해당 회원 정보를 검색하고 검색된 결과를 반환. 반환값 있음
// 4. 회원정보 수정: 1명 회원의 수정된 정보포함해서 모든정보를 전달 받아서 DB에서 해당 회원의 id를 이용해 수정진행하고 종료. 반환값 없음
// 관리자 기능
// 1. 회원전체 조회: DB 회원테이블에서 전체 회원 정보를 검색해서 반환. 매개변수는 없고, 반환값 있음
// 2. 회원 이름으로 조회: 이름에 대한 일부 문자열을 전달 받아서 DB 회원테이블에서 일치하는 회원 정보를 검색해서 반환. 매개변수는 있고, 반환값 있음
//

import java.lang.reflect.Member;
import java.util.ArrayList;

public interface IMemberDAO {

    // 회원관리 기능
    // 1. 회원가입
    void insertMember(MemberDTO dto);

    // 2. 회원탈퇴 - id필요
    void deleteMember(String memId);

    // 3. 회원정보 검색
    MemberDTO selectMember(String memId);

    // 4. 회원정보 수정 - 수정은 해당 id의 레코드의 모든 정보를 수정하게됨, 수정시 클라이언트에서 수정된 모든 정보가 전달이 되면
    // 전달된 정보 모두 업데이트
    void updateMember(MemberDTO dto);

    // 관리자 기능
    // 1. 전체 회원 정보 검색 - 한명의 정보 MemberDTO에 담기고 여러명은 MemberDTO를 배열과 같은 콜렉션에 담아 반환
    ArrayList<MemberDTO> getAllMember();

    // 2. 이름의 일부 문자열과 이름이 매칭되는 회원들을 검색해서 반환 - 회원이 없을수도 있고 여러명일 수도 있음
    ArrayList<MemberDTO> getMemberByName(String nameStr);
}
