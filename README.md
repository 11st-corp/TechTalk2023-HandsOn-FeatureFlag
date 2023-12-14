<p align="center">
    <img src="./image.png" />
</p>

<hr />

# Feature Flag Example Project (using OpenFeature / Flagd)

OpenFeature SDK와 Java Flagd Provider를 사용하여 서비스 로직에 Feature Flag를 적용한 예제 프로젝트입니다.

## How to Run

```shell
$ ./gradlew bootRun
```

[Spring Docker Compose Support](https://spring.io/blog/2023/06/21/docker-compose-support-in-spring-boot-3-1) 설정에 의해 애플리케이션이 실행되면 `/compose.yaml`에 정의된 `flagd`가 실행됩니다.

프로젝트 루트의 `http` 디렉터리 각 파일을 IntelliJ IDE에서 열어 API를 실행해 볼 수 있습니다.

## Dependencies

- [OpenFeature](https://openfeature.dev)
- [Flagd](https://flagd.dev)

<hr />
<p align="center">
    <img width="7%" alt="_2021-05-12__1 58 58" src="https://raw.githubusercontent.com/11st-corp/.github/main/profile/img/11st_logo.png?raw=true">
</p>
<hr />
