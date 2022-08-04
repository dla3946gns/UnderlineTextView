# UnderlineTextView

# Overview

특정 디바이스(갤럭시Z 폴드, 갤럭시Z 플립)에서 Html.fromHtml()에 u태그를 넣어<br/>
만든 텍스트의 밑줄이 노출되지 않는 이슈로 커스텀 텍스트뷰를 만들었습니다.<br/>
아래와 같이 dependencies에 추가하시면 사용하실 수 있습니다.

# 라이브러리 추가

maven { url "https://jitpack.io" } 를 Project Gradle에 추가.
        
```java
  dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url "https://jitpack.io" }
    }
  }
```

# 의존성 주입

app module gradle에 추가.

```java
  dependencies {
    implementation 'com.github.dla3946gns:UnderlineTextView:'
  }
```

# 사용법
