export class Person {
    username;
    age;
    constructor(u, a) {
        this.username = u;
        this.age = a;
    }
    getUsername() {
        return this.username;
    }
    getAge() {
        return this.age;
    }
}