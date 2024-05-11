package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.Map;
import java.util.Optional;


public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member>

    @Override
    public Member save(Member member) {
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optioal.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }
}
