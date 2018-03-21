
Run both the apps StudentServiceHystrix and SchoolServiceHystrix

URLS :

Invoke --> http://localhost:8098/getstudentdetailsforschool/BCA

Invoke --> http://localhost:9098/getschooldetails/BCA

No stop the StudentServiceHystrix
and again invoke --> http://localhost:9098/getschooldetails/BCA

invoke --> http://localhost:9098/hystrix.stream

invoke --> http://localhost:9098/hystrix – This is visual dashboard initial state.

add http://localhost:9098/hystrix.stream to dashboard