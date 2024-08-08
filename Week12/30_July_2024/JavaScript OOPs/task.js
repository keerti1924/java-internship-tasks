class Task {
    constructor(title) {
        this.title = title;
        this.completed = false;
    }

    complete() {
        this.completed = true;
    }

    show() {
        console.log(`${this.title}: ${this.completed ? 'Completed' : 'Not Completed'}`);
    }
}

class TaskList {
    constructor() {
        this.tasks = [];
    }

    addTask(task) {
        this.tasks.push(task);
    }

    removeTask(taskTitle) {
        this.tasks = this.tasks.filter(task => task.title !== taskTitle);
    }

    findTask(taskTitle) {
        return this.tasks.find(task => task.title === taskTitle);
    }

    completeAll() {
        this.tasks.forEach(task => task.complete());
    }

    showTasks() {
        this.tasks.forEach(task => task.show());
    }
}

const taskList = new TaskList();
taskList.addTask(new Task('Learn OOP'));
taskList.addTask(new Task('Build a project'));

taskList.findTask('Learn OOP').complete();
// taskList.removeTask('Learn OOP');
// taskList.completeAll();
taskList.showTasks();
// Output:
// Learn OOP: Completed
// Build a project: Not Completed
