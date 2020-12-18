<template>
  <div class="deptAdd">

    <h2>부서등록 및 수정</h2>
    <form v-on:submit.prevent="x">
      <span><b>부서번호:</b><input type="text" name="deptno" v-model="dept.deptno" /></span>
      <span><b>부서명:</b><input type="text" name="dname" v-model="dept.dname" /></span>
      <span><b>부서위치:</b><input type="text" name="loc" v-model="dept.loc" /></span>
      <span class="btn_box"><button>저장</button></span>
    </form>

  </div>
</template>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
import axios from "axios";
import eventBus from "./EventBus";
export default {
  name: "DeptAdd",
  data: function() {
    return {
      dept: { // input에 기입한 데이터 저장
        deptno: "",
        dname: "",
        loc: "",
      },
    };
  },
  methods: {
    x: function(e) {
      var url = "http://localhost:8090/app/add"; // sts의 add함수 호출
      console.log("==========================", this.dept);
      axios
        .post(url, { // post요청, url, data전송
          deptno: this.dept.deptno,
          dname: this.dept.dname,
          loc: this.dept.loc,
        })
        .then((res) => {
          eventBus.$emit("xyz", this.dept); //insert 성공후 이벤트 버스에 저장
        })
        .catch();
    },
  },
};
</script>

<style scoped>
  .deptAdd h2 {
    text-align: center;
  }
  .btn_box {
    float: right;
  }
  span {
    display: block;
    margin-bottom: 10px;
  }
  b {
    display: inline-block;
    width: 70px;
    text-align: right;
    margin-right: 8px;
  }
  button {
    border: none;
    color: rgb(255, 255, 255);
    background: rgb(71, 54, 143);
    padding: 5px 10px;
  }
  
</style>
