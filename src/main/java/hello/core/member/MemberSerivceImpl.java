package hello.core.member;

public class MemberSerivceImpl implements MemberService{

    private MemberRepository memberRepository =new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMemeber(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
