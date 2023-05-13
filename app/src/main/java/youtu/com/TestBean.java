package youtu.com;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class TestBean {

    @SerializedName("status")
    private Integer status;
    @SerializedName("msg")
    private String msg;
    @SerializedName("data")
    private List<DataDTO> data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    public static class DataDTO {
        @SerializedName("id")
        private Integer id;
        @SerializedName("name")
        private String name;
        @SerializedName("picSmall")
        private String picSmall;
        @SerializedName("picBig")
        private String picBig;
        @SerializedName("description")
        private String description;
        @SerializedName("learner")
        private Integer learner;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPicSmall() {
            return picSmall;
        }

        public void setPicSmall(String picSmall) {
            this.picSmall = picSmall;
        }

        public String getPicBig() {
            return picBig;
        }

        public void setPicBig(String picBig) {
            this.picBig = picBig;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getLearner() {
            return learner;
        }

        public void setLearner(Integer learner) {
            this.learner = learner;
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", picSmall='" + picSmall + '\'' +
                    ", picBig='" + picBig + '\'' +
                    ", description='" + description + '\'' +
                    ", learner=" + learner +
                    '}';
        }
    }
}
