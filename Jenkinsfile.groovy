@ -1,43 +0,0 @@
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Lấy mã nguồn từ GitHub
                git 'https://github.com/LePhuNhan/JenkinsWebApplicationDemo.git'
'
            }
        }

        stage('Build') {
            steps {
                // Biên dịch dự án ASP.NET
                sh 'dotnet build'
            }
        }

        stage('Test') {
            steps {
                // Chạy các bài kiểm thử
                sh 'dotnet test'
            }
        }

        stage('Deploy') {
            steps {
                // Lệnh triển khai (deploy) tùy vào môi trường của bạn
                echo 'Triển khai ứng dụng...'
            }
        }
    }

    post {
        success {
            echo 'Pipeline đã chạy thành công.'
        }
        failure {
            echo 'Pipeline thất bại.'
        }
    }
}