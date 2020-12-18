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
    return { list: [] }; // 전체 사원목록저장
  },
  beforeMount() {
    this.x(); // 전체 목록 가져오는 함수 호출
  },
  methods: {
    x: function() {
      var xxx = this.list;
      ////npm install axios --save
      //스프링에서 서버 가동후 브라우저에서 서버 주소 복/붙
      //yarn serve시 node-module없다는 에러 발생시
      //npm install --save core-js 실행
      axios
        .get("http://localhost:8090/app/") // get방식 요청(sts의 서버주소로 요청)
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

