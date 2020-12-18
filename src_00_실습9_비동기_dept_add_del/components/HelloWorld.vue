<template>
  <div class="hello">
    <table border="1">
      <thead>
        <tr>
          <td>부서번호</td>
          <td>부서명</td>
          <td>부서위치</td>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(dept, idx) in list" :key="idx">
          <td>{{ dept.deptno }}</td>
          <td>{{ dept.dname }}</td>
          <td>{{ dept.loc }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
import axios from "axios";
export default {
  name: "HelloWorld",
  props: {},
  data: function() {
    return { list: [] };
  },
  beforeMount() {
    this.x();
  },
  methods: {
    x: function() {
      var xxx = this.list;
      //스프링에서 서버 가동후 브라우저에서 서버 주소 복/붙
      //yarn serve시 node-module없다는 에러 발생시
      //npm install --save core-js 실행
      axios
        .get("http://localhost:8077/app/")
        .then((res) => {
          console.log(res);
          res.data.map(function(ele, idx) {
            xxx.push(ele);
          });
        })
        .catch((error) => console.log(error));
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
