package creational_patterns.prototype.after;

import java.util.Objects;

public class GithubIssue implements Cloneable{

    private int id;

    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }
    //shallowCopy deepCopy
    @Override
    public Object clone() throws CloneNotSupportedException {
        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setUser(this.repository.getUser());
        githubRepository.setName(this.repository.getName());

        GithubIssue githubIssue = new GithubIssue(githubRepository);
        githubIssue.setId(this.id);
        githubIssue.setTitle(this.title);

        return githubIssue;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)return true;
        if(o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }
}
