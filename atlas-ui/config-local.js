define([], function(){

  var config = {};
  config.cohortComparisonResultsEnabled = true;
  config.userAuthenticationEnabled = true;
  config.plpResultsEnabled = true;
  config.useExecutionEngine = true;
  config.api = {
    name: 'Local',
    url: 'http://localhost:5555/webapi/'
  };

  config.externalLibraries = [
    'http://localhost:8081/src/cohort-report-geospatial/index.js',
    'http://localhost:8081/src/person-map/index.js'
  ];

  return config;
});