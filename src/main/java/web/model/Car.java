package web.model;

public class Car {

    private Long id;

    private String modelName;

    private Integer engine;

    public Car(Long id, String modelName, Integer engine) {
        this.id = id;
        this.modelName = modelName;
        this.engine = engine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getEngine() {
        return engine;
    }

    public void setEngine(Integer engine) {
        this.engine = engine;
    }
}
