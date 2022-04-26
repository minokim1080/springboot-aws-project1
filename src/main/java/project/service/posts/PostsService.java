package project.service.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.posts.PostsRepository;
import project.web.dto.PostsSaveRequestDto;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return PostsRepository.save(requestDto.toEntity()).getId();
    }
}
