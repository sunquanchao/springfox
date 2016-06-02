/*
 *
 *  Copyright 2015-2016 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */
package springfox.documentation.spring.web.dummy.controllers;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.Map;

@RestController
@RequestMapping("/bugs")
public class BugsController {
  @RequestMapping(value = "1306", method = RequestMethod.POST)
  public ResponseEntity<Void> bug1306(@RequestParam Map<String, String> paramMap) {
    return ResponseEntity.ok(null);
  }

  @ApiImplicitParams(
      @ApiImplicitParam(dataType = "string", allowMultiple = true, paramType = "header")
  )
  @RequestMapping(value = "1209", method = RequestMethod.POST)
  public ResponseEntity<String> bug1209() {
    return ResponseEntity.ok("");
  }

  @RequestMapping(value = "1162", method = RequestMethod.POST)
  public ResponseEntity<Date> bug1162() {
    return ResponseEntity.ok(new Date(new java.util.Date().getTime()));
  }
}