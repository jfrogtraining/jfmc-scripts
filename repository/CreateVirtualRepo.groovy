repoName = userInput (
    type : "STRING",
    description : "Please provide a repository name"
  )

repoList = userInput (
    type : "REPOSITORY",
    description : "Please provide repositories to aggregate",
    multivalued : true
  )
DefaultDeploymentRepo = userInput (
    type : "REPOSITORY",
    description : "Please provide Default deployment repository",
    multivalued : false
  )
virtualRepository(name) {
  repositories (repo*.key) 
  notes "Created through JFrog Mission Control"
  defaultDeploymentRepo "$DefaultRepo.key"
  includesPattern "**/*" 
  excludesPattern "" 
  packageType "generic" 
}
